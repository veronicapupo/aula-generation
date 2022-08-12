package com.generation.conta;

public class Menu {
    public static void main(String[] args) {

        Conta conta1 = new Conta(123456, "123", "CC", "Ana", 222.00f);
        conta1.visualizar();
        Conta conta2 = new Conta(123457, "123", "CC", "Lia", 2255.00f);
        conta2.visualizar();
        System.out.println("Saldo da conta c1: " + conta1.getSaldo());
        conta1.setSaldo(5000.0f);
        System.out.println("\nSaldo atualizado da conta c1: " + conta1.getSaldo());
        System.out.println("Saldo da conta c2: " + conta2.getSaldo());
        conta2.setTitular("Lia Carla");
        System.out.println("Nome atualizado: " + conta2.getTitular());

        Conta c3 = new Conta();
        c3.visualizar();
        c3.setNumero(25896);
        c3.setTitular("Roberto");
        c3.visualizar();

        if (conta2.sacar(50.00f) == true) {
            conta2.visualizar();
        } else
            System.out.println("Saldo insuficinete");
        }
    }
