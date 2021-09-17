package org.banco.app.models;

public class Usuario {
    private Integer Cuenta;
    private String Nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String Contraseña;
    private Float saldo;

    public Usuario(){

    }

    public Integer getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Integer cuenta) {
        Cuenta = cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void depositarMonto(Float monto){
        this.saldo += monto;
    }

    public void retirarMonto(Float monto){
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Cuenta=" + Cuenta +
                ", Nombre='" + Nombre + '\'' +
                ", PrimerApellido='" + PrimerApellido + '\'' +
                ", SegundoApellido='" + SegundoApellido + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
