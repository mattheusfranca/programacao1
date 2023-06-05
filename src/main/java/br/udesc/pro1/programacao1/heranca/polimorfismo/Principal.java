/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.pro1.programacao1.heranca.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author mattheus
 */
public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fala();
        
        Animal cachorro = new Cachorro(); //&123
        cachorro.fala();
        Cachorro c1 = (Cachorro) cachorro;
        c1.corre();
//        cachorro.corre(); Não possíve utilizar o método sem converter para Cachorro
        

        //Casting - conversão para Cachorro
        Cachorro cachorroConvertido = (Cachorro) cachorro; //&123
        cachorroConvertido.corre();
        
        
        Animal gato = new Gato();
        gato.fala();
        
        Animal[] animais = new Animal[3];
        animais[0] = animal;
        animais[1] = cachorro;
        animais[2] = gato;
        
        for(int i=0; i<animais.length;i++){
            animais[i].fala();
        }
        
        
        ArrayList<Animal> animais2 = new ArrayList();
        animais2.add(animal);
        animais2.add(gato);
        animais2.add(cachorro);

        for(Animal a: animais){
            a.fala();
            if(a instanceof Cachorro){
                ((Cachorro) a).corre();
            }
        }
        
        
        
        Animal cachorroEspecial = new CachorroEspecial(); //&123
        cachorroEspecial.fala();
        
        CachorroEspecial cachorroEspecial2 = (CachorroEspecial) cachorroEspecial;
        cachorroEspecial2.corre();
        
    }
}
