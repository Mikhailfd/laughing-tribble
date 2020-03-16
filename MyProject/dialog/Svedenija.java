package project.dialog;
import project.connected.Database;
import project.getmethod.Clientinfo;
import project.getmethod.Tovarinfo;
import project.getmethod.Zakazinfo;
import project.getmethod.Storeinfo;
import project.exceptions.NoSuchClientException;
import project.group.Clienti;
import project.group.Store;
import project.group.Tovari;
import project.group.Zakaz;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Svedenija {
    private static final String table1 = "select * from Clienti;";
    private static final String table2 = "select * from Tovari;";
    private static final String table3 = "select * from Zakaz;";
    private static final String table4 = "select * from Store;";
    private static final String SAVE_NEW_Client =
            "insert into Clienti  value (null, ?, ?,null)";
    private static final String SAVE_NEW_Tovari =
            "insert into Tovari  value (null, ?, ?)";
    private static final String SAVE_NEW_Zakaz =
            "insert into Zakaz  value (null, null, null, ?)";
    private static final String SAVE_NEW_Store =
            "insert into Tovari  value (null, ?, null)";
    private static final String NAME =
            "select count(name) from Clienti  where name = ?;";
    private static final String NAME1 =
            "select count(name) from Tovari  where name = ?;";
    private static final String DELETE_NAME =
            "delete from Clienti  where name = ?;";
    private static final String DELETE_NAME1 =
            "delete from Tovari  where nazvanie = ?;"


    public List<Clienti> getAll() throws SQLException {

        Statement statement = Database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(table1);

        List<Clienti> result = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String adress = resultSet.getString(3);
            int idstore=resultSet.getInt(4);

            result.add(new Clienti(id, name, adress,idstore));
        }

        return result;
    }

    public List<Tovari> getAll1() throws SQLException {

        Statement statement = Database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(table2);

        List<Tovari> result = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String nazvanie = resultSet.getString(2);
            int cena=resultSet.getInt(3);

            result.add(new Tovari(id, nazvanie,cena));
        }

        return result;
    }
    public List<Zakaz> getAll2() throws SQLException {

        Statement statement = Database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(table3);

        List<Zakaz> result = new ArrayList<>();

        while (resultSet.next()) {
            int idZakaza = resultSet.getInt(1);
            int idClienta = resultSet.getInt(2);
            int cena=resultSet.getInt(3);
            int idTovara=resultSet.getInt(4);

            result.add(new Zakaz(idZakaza, idClienta,cena, idTovara));
        }

        return result;
    }
    public List<Store> getAll3() throws SQLException {

        Statement statement = Database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(table4);

        List<Store> result = new ArrayList<>();

        while (resultSet.next()) {
            int idStore = resultSet.getInt(1);
            String nazvanie= resultSet.getString(2);
            int idTovara=resultSet.getInt(3);

            result.add(new Store(idStore, nazvanie, idTovara));
        }

        return result;
    }

    public void saveNewClient(Clientinfo form) throws SQLException {

        if (isNamePersists(form.getName())) {
            System.err.println("Имя уже существует");
            return;
        }

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(SAVE_NEW_Client);

        preparedStatement.setString(1, form.getName());
        preparedStatement.setString(2, form.getadress());

        preparedStatement.executeUpdate();
    }
    public void saveNewTovari(Tovarinfo form1) throws SQLException {

        if (isNamePersists(form1.getname())) {
            System.err.println("Наименование уже существует");
            return;
        }

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(SAVE_NEW_Tovari);

        preparedStatement.setString(1, form1.getname());

        preparedStatement.executeUpdate();
    }
    public void saveNewZakazi(Zakazinfo form2) throws SQLException {

        if (isNamePersists(form2.getIdzakaza())) {
            System.err.println("Заказ уже существует");
            return;
        }

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(SAVE_NEW_Zakaz);

        preparedStatement.setString(1, form2. getIdzakaza());

        preparedStatement.executeUpdate();
    }
    public void saveNewStore(Storeinfo form3) throws SQLException {

        if (isNamePersists(form3.getNazvanie())) {
            System.err.println("Магазин уже существует");
            return;
        }

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(SAVE_NEW_Zakaz);

        preparedStatement.setString(1, form3. getNazvanie());

        preparedStatement.executeUpdate();
    }
    public void deleteClientName(String name) throws SQLException {

        if (!isNamePersists(name)) {
            throw new NoSuchClientException(name);
        }

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(DELETE_NAME);

        preparedStatement.setString(1, name);

        preparedStatement.executeUpdate();
    }
    public void deleteTovariNazv(String nazvanie) throws SQLException {

        if (!isNamePersists(nazvanie)) {
            throw new NoSuchClientException(nazvanie);
        }

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(DELETE_NAME1);

        preparedStatement.setString(1, nazvanie);

        preparedStatement.executeUpdate();
    }

    private boolean isNamePersists(String name) throws SQLException {

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(NAME);


        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();

        int count = resultSet.getInt(1);

        return count >= 1;
    }
    private boolean isNamePersists1(String name) throws SQLException {

        PreparedStatement preparedStatement =
                Database.getConnection().prepareStatement(NAME1);


        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();

        int count = resultSet.getInt(1);

        return count >= 1;
    }
}
