package sesion_cuatro;

public interface CocheCRUD {
    default void save() {
        System.out.println("save()");
    }
    default void findAll() {
        System.out.println("findAll()");
    }
    default void delete() {
        System.out.println("delete()");
    }
}