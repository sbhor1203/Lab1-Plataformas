public class ItemDataJ {
     Object originalValue;
    public ItemDataJ(Object originalValue){
        this.originalValue = originalValue;
    }

    public String getType(){
        if (originalValue instanceof String) {
            return "cadena";
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Boolean) {
            return "booleano";
        } else {
            return null;
        }
    }

    public String getInfo() {
        if (originalValue instanceof String stringValue) {
            return "L" + stringValue.length();
        } else if (originalValue instanceof Integer){
            String resp = "M";
            int value = (int) originalValue;
            if(value % 10 == 0){
                return resp+"10";
            }else if (value % 5 == 0){
                return resp+"5";
            }else if (value % 2 == 0){
                return resp+"2";
            }else{
                return null;
            }
        }else if(originalValue instanceof Boolean){
            boolean value = (boolean) originalValue;
            if(value){
                return "Es verdadero";
            }else{
                return "Es falso";
            }
        }else{
            return null;
        }
        }
}
