package A3_P1;

public class MetodoIMC_1 {
    private int id;
    private static int proximoId = 1;
    private String nome;
    private String sobrenome;
    private int idade;
    private Double peso;
    private Double altura;
    private String estado;
    private Double imc;


    public MetodoIMC_1(String nome,String sobrenome, int idade, Double peso, Double altura) {
        this.setId(proximoId++);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
        this.setIMC();
        this.setEstado();
    }
    public int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean buscaID(int[] vetorID, int buscado) {
        int inicio = 0;
        int fim = vetorID.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetorID[meio] == buscado) {
                return true;
            } else if (vetorID[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return false;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        if (altura > 0.00) {
            this.altura = altura;
        }
    }


    public void setEstado() {
        if (this.imc != null) {
            if (this.imc < 18.5) {
                this.estado = "Abaixo do peso";
            } else if (this.imc >= 18.5 && this.imc < 25) {
                this.estado = "Peso normal";
            } else if (this.imc >= 25 && this.imc < 30) {
                this.estado = "Sobrepeso ";
            } else if (this.imc >= 30 && this.imc < 35) {
                this.estado = "Obeso I";
            } else if (this.imc >= 35 && this.imc < 40) {
                this.estado = "Obesidade II";
            } else if (this.imc >= 40) {
                this.estado = "Obesidade III";
            }else {
                this.estado = "";
            }
        } else {
            this.estado = "IMC não calculado";
        }
    }

    public void setIMC() {
        if (altura != null && peso != null && altura > 0 && peso > 0) {
            double imc = this.peso / (this.altura * this.altura);
            this.imc = imc;
        }
    }



    @Override
    public String toString() {
        return "\n- INFORMAÇÕES: " + "\n\n" +
                "[ID] " + this.id + "\n" +
                "[Nome] " + this.nome +" "+ this.sobrenome +"\n"
                + "[Idade] " + this.idade + " Anos" + "\n"
                + "[Altura] " + this.altura + " Metros" + "\n"
                + "[Peso] " + this.peso + " Kg" + "\n"
                + "[IMC] " + this.imc + "\n"
                + "[Estado] " + this.estado;
    }
}
//Felipe20rich