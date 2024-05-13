package unidade_1;


        public class Main {
            private String numeroSerie, fabricante, modelo, tipo, madeira;
            private double preco;
            public Main(
                    String numeroSerie, String fabricante,
                    String modelo, String tipo,
                    String madeira, double preco) {
                        this.numeroSerie = numeroSerie;
                        this.fabricante = fabricante;
                        this.modelo = modelo;
                        this.tipo = tipo;
                        this.madeira = madeira;
                        this.preco = preco;

            }

            public Main(String number, String fender, String telecaster, String eleétrica, String mogno, String number1) {
            }

            public String getNumeroSerie () {
                        return numeroSerie;
                    }
                    public void setNumeroSerie (String numeroSerie) {
                        this.numeroSerie = numeroSerie;

            }
                    public String getFabricante () {
                        return fabricante;
            }
                    public void setFabricante (String fabricante) {
                        this.fabricante = fabricante;
            }
                    public String getModelo () {
                        return modelo;
            }
                    public void setModelo (String modelo) {
                        this.modelo = modelo;
            }
                    public String getTipo () {
                        return tipo;
            }
                    public void setTipo (String tipo) {
                        this.tipo = tipo;
            }
                    public String getMadeira () {
                        return madeira;
                    }
                    public void setMadeira (String madeira) {
                        this.madeira = madeira;
            }
                    public double getPreco () {
                          return preco;
            }
                    public void setPreco (Double preco) {
                        this.preco = preco;
            }

            public static void main(String[] args) {


                Main minhaGuitarra = new Main("01020304", "fender", "telecaster", "eleétrica", "mogno", "1500");

                System.out.println(minhaGuitarra.getNumeroSerie());
                System.out.println(minhaGuitarra.getFabricante());
                System.out.println(minhaGuitarra.getModelo());
                System.out.println(minhaGuitarra.getTipo());
                System.out.println(minhaGuitarra.getPreco());
                System.out.println(minhaGuitarra.getMadeira());

            }
            }

