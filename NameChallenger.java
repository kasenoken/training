public class NameChallenger {
    public static void main(String[] args) {
        String name = "DAVI PEREIRA DE MENDONÇA";
        String nameNew = "";
        for (String sName : name.toLowerCase().split(" ")) {
            if (!"".equals(sName)) {
                if (!"".equals(nameNew)) nameNew += " ";
                if (sName.length()>2) { // utilizado para nomes próprios, para não colocar maiúscula em De, por exemplo
                    nameNew += sName.substring(0,1).toUpperCase() + sName.substring(1);
                } else {
                    nameNew += sName;
                }
            }
        }
        System.out.println("Teste: '"+nameNew+"");
    }
}
