package jpp.wuetunes.model.metadata;

public class Genre {
    private int id;
    private String name;

    public Genre(int id, String name){
        if(id < 0 || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return getId() + ". " + getName();
    }
}
