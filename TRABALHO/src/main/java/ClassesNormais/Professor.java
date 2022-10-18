/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesNormais;

import ClasseAbstrata.Funcionario;
import Interface.PesssoaFisica;


/**
 *
 * @author andre_xhsxfvt
 */
public class Professor extends Funcionario implements PessoaFisica{

    private String matricula, nome, cpf;

    public Professor(String Pessoa) {
        super(Pessoa);
    }
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

	public String getMatricula()
	{
        	return matricula;
	}
	
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public void setNOME(String nome) {
		this.nome = nome;
			
	}
	public String getNOME() {
		
	return nome;	
        }
}

