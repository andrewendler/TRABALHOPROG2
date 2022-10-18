/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesNormais;

import ClasseAbstrata.Pessoa;
import Interface.PesssoaFisica;
/**
 *
 * @author andre_xhsxfvt
 */
public class Aluno extends Pessoa implements PesssoaFisica {
	public Aluno(String nome, String cpf, String matricula) {
		}
	private String nome, cpf, matricula;
	
	
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

        @Override
	public void setNOME(String nome) {
		this.nome = nome;
			
	}
	public String getNOME() {
		
	return nome;	
        }
}