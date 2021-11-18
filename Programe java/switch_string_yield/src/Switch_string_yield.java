    public class Switch_string_yield {
        public static void main(String[] args) {
            int value = 0;
            String stringValue = switch (value){
                case 0: yield "NO";
                case 1: yield "Yes";
                default: yield "Invalid value";
            };
            System.out.println(stringValue);
        }}

