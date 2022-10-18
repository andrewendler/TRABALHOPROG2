/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author andre_xhsxfvt
 */
public abstract class Empresa {
    protected String banco;
    protected String conta;

	  public Empresa(String banco, String conta) {
	  }
	  public void setBanco(String banco) {
	    this.banco = banco;
	  }
	  public String getBanco() {
		    return banco;
		  }
          public void setConta(String conta) {
	    this.conta = conta;
	  }
	  public String getConta() {
		    return conta;
		  }
	}

