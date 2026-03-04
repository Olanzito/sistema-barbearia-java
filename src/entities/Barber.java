package entities;

public class Barber {

    private String name;
    private String cellNumber;
    private int code;
    private boolean ocupado;


    public Barber(String name, String cellNumber, int code) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.code = code;
    }

    public Barber(String name, String cellNumber, int code, boolean ocupado) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.code = code;
        this.ocupado = ocupado;
    }

    public String getName() {
        return name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public int getCode() {
        return code;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString(){
        return "Código: "
                + code
                +", Nome: "
                +name
                + ", Status: "
                + (ocupado ? "Ocupado" : "Disponível");
    }




}

