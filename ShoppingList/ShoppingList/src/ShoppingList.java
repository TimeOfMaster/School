public class ShoppingList {

    private List<Item> shoppingList;

    public ShoppingList() {
        shoppingList = new List<Item>(); 

        preset();
    }

    public void preset(){
        String presetItems[] = {"Brot", "Pizza", "Cola", "Kaffee", "Wodka Lemon", "Chips"};

        for(int i = 0; i < presetItems.length; i ++){
            addItem(presetItems[i]);
        }
    }

    public void addItem(String content){
        Item pContent = new Item(content);
        shoppingList.append(pContent);
    }    

    public void removeItem(){
        shoppingList.toFirst();
        shoppingList.remove();
    }

    public void listList(){
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Content of the shoppingList");
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        shoppingList.toFirst();
        while(shoppingList.hasAccess() == true){
            System.out.println(shoppingList.getContent().getType());
            shoppingList.next();
            System.out.println("");
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
