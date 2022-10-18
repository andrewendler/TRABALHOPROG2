/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author andre_xhsxfvt
 */
public abstract class Funcionario extends Pessoa{
public Funcionario(String Pessoa) {
		
	}

protected String nome, cpf;
	
	
        @Override
	public String getCPF() 
	{
		return cpf;
	}

	
        @Override
	public void setCPF(String cpf) 
	{
		this.cpf = cpf;
	}

        @Override
	public String getNome() 
	{
		return nome;
	}

        @Override
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

}
