/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author andre_xhsxfvt
 */
public interface Conta {
        public void depositar(double valor);
	public void sacar(double valor) throws Exception;
	public double getSaldo();
	
	public void setCodigo(String codigo);
        public String getCodigo();
}
