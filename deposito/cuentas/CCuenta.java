package cuentas;

/**
 * Esta clase identifica una cuenta y le hace el ingreso o retirada de valores 
 * @author Henrique
 * @since 16/12/2019
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    /**
     * @param nombre es el nombre del proprietario de ela cuenta 
     */
    private String cuenta;
    /**
     * @param cuenta es el numero de tipo entero de la cuenta
     */
    private double saldo;
    private double tipoInter�s;

    String getCuenta() {
		return cuenta;
	}

	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
        /**
         * No ingresa valores  negativos
         */
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        /**
         * No retira valores negativos
         */
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        /**
         * No retira valor inexistente en cuenta
         */
        saldo = saldo - cantidad;
    }
}
