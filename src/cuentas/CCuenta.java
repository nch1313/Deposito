/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * CCuenta representa la informacion de una cuenta bancaria
 * @author nch1313
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Constructor basico. Crea un objeto Ccuenta recibiendo ningun parametro.
 */
    public CCuenta()
    {
    }
/**
 * 2º Constructor con cuatro parametros. Crea una Ccuenta recibiendo los parametros nombre, cuenta, saldo y tipo
 * @param nom nombre del dueño de la cuenta. String
 * @param cue numero de la cuenta. String
 * @param sal saldo de la cuenta. double
 * @param tipo tipo de interes de la cuenta. double
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Introduce el valor de nom al objeto creado por Ccuenta
     * @param nom asignado mediante el argumento nombre
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Obtenemos el valor del nombre de la cuenta
     * @return llama al metodo getNombre(). obtiene el nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * obtenemos el valor del saldo de la cuenta
     * @return llama al metodo getSaldo. Obtiene el valor del saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * excepcion que delimita el valor minimo de la cuenta a ingresar
     * @param cantidad argumento a examinar de cantidad a ingresar
     * @throws Exception Mensaje de error por cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Excepciones que impide retirar cantidades negativas, iguales a 0 o sin saldo
     * @param cantidad argumento a examinar
     * @throws Exception lanza mensaje de error por cantidad negativa o igual a 0, o lanza mensaje de error falta de saldo 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * obtiene el numero de cuenta
     * @return llama al metodo getCuenta que a su vez obtiene el num de cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * obtiene el nombre de la cuenta
     * @return devuelve el valor del atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * almacena el valor del parametro nombre
     * @param nombre valor obtenido por instancias
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Obtiene el tipo de interes
     * @return devuleve el valor del atributo tipointeres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Almacena el valor del parametro tipointeres
     * @param tipoInterés valor obtenido por instancias
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el nuero de cuenta
     * @return devuelve el valor del atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Alamcena el valor del parametro cuenta
     * @param cuenta valor obtenido por instancias
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtieme el saldo de la cuenta
     * @return devuelve el valor del atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Almacena el saldo de la cuenta
     * @param saldo calor obtenido por instancias
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
