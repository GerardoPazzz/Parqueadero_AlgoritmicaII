package Parquedero.Clases;

public class vehiculo {
    private String placa="F5U-597";
    private String tipoVehiculo="Toyota";
    
    public vehiculo(String placa,String tipoVehiculo){
        this.placa=placa;
        this.tipoVehiculo=tipoVehiculo;
    };

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getplaca() {
        return placa;
    }

    public void gettipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String gettipoVehiculo() {
        return tipoVehiculo;
    }
}


