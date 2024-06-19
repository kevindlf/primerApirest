package com.uch.apirest.models;

public class Auto {

        private String marca;
        private String modelo;
        private int año;

        // Constructor con parámetros
        public Auto(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }
        public Auto(){
        }

    public String toString() {
        return "Auto[marca=" + this.marca + ", modelo=" + this.modelo + ", año=" + this.año + "]";
    }

    // Getters y setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String tipo) {
            this.modelo = modelo;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }
    }

