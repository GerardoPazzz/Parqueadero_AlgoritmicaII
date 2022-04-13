package Parquedero.Clases;

public abstract class vehiculo extends Cliente{
    protected String placa;
    protected String tipodeVehiculo;

    public vehiculo(){}
    public vehiculo(String placa, String tipodeVehiculo){
        this.placa = placa;
        this.tipodeVehiculo = tipodeVehiculo;
    }

    public abstract void setplaca();
    public abstract String getplaca();
    public abstract void settipodeVehiculo();
    public abstract String gettipodeVehiculo();
}   
