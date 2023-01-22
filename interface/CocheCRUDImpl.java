package sesion_cuatro;

public class CocheCRUDImpl implements CocheCRUD {

    public CocheCRUDImpl() {
        save();
        findAll();
        delete();
    }

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
    }
}
