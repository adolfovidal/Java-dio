package br.com.dio;

class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Funcionario(); //upcast
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        vendedor = vendedor = (Vendedor) new Funcionario(); //downcast
    }
}
