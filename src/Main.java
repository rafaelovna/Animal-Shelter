import animals.Cat;
import animals.Cat.Breed;
import animals.Cat.FavToy;
public class Main {
    public static void main(String[] args) {
        Breed breed = new Breed("British Shorthair", "GB", "short");

        Cat cat = new Cat("Мурзик", 3);
        cat.meow();
        cat.setBreed(breed);

        Cat begemot = new Cat("Бегемот", 1);
        begemot.meow();
        System.out.println("У кота " + cat.getName() + " " + cat.getFriends().length + " друзей");
        cat.addFriend(begemot);

        System.out.println("У кота " + cat.getName() + " " + cat.getFriends().length + " друзей");
        cat.getFriends()[0].meow();
        FavToy favToy = cat.new FavToy("Рыбка", "заводная");
        System.out.println(favToy.getCatName());


        System.out.println(Cat.getCount());
    }

}