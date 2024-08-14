class Phone{
    String brand,model ;
    int price, storage;

    public Phone(String brand, String model, int price, int storage){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }

    public int getStorage(){
        return storage;
    }

    public void displayDetails(){
        System.out.println("Mobiles Details");
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Price: "+ price);
        System.out.println("Storage in "+ storage+"GB");
    }

    public static Phone comparePrice(Phone phone1, Phone phone2) {
        if (phone1.price < phone2.price) {
            return phone1;
        } else {
            return phone2;
        }
    }

    public static Phone findMaxStoragePhone(Phone[] phones) {
        Phone maxStoragePhone = phones[0];

        for (int i = 1; i < phones.length; i++) {
            if (phones[i].getStorage() > maxStoragePhone.getStorage()) {
                maxStoragePhone = phones[i];
            }
        }
        return maxStoragePhone;
    }
}


public class MobilePhone {
    public static void main(String[] args) {
        Phone[] Mobiles = new Phone[4];
        Mobiles[0] = new Phone("Apple", "iPhone 14", 999, 128);
        Mobiles[1] = new Phone("Samsung", "Galaxy S23", 799, 256);
        Mobiles[2] = new Phone("Google", "Pixel 7", 699, 128);
        Mobiles[3] = new Phone("OnePlus", "OnePlus 9", 729, 512);

        Phone cheaperPhone = Phone.comparePrice(Mobiles[0], Mobiles[1]);
        cheaperPhone = Phone.comparePrice(Mobiles[2], Mobiles[3]);
        System.out.println("The cheaper phone is:");
        cheaperPhone.displayDetails();

        Phone maxStoragePhone = Phone.findMaxStoragePhone(Mobiles);
        System.out.println("The phone with the highest storage is:");
        maxStoragePhone.displayDetails();
    }
}