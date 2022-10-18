/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author andre_xhsxfvt
 */
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCPF() 
	{
		return this.cpf;
	}

	public void setCPF(String cpf) 
	{
		this.cpf = cpf;
	}
}
    
