package CollectionLesson;

public class EmployeHomework {
    private int id;
    private String name;
    private String position;
    private int oylik;

    public EmployeHomework(int id, String name, String position, int oylik) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.oylik = oylik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getOylik() {
        return oylik;
    }

    public void setOylik(int oylik) {
        this.oylik = oylik;
    }
}
