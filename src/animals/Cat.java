package animals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Cat {
    private static int count;

    public static int getCount() {
        return count;
    }

    public static class Breed {
        private String breedName;
        private String country;
        public String hairType;

        public Breed(String breedName, String country, String hairType) {
            this.breedName = breedName;
            this.country = country;
            this.hairType = hairType;
        }
        public String getBreedName() {
            return breedName;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }
    public class FavToy{
        private String name;
        private String type;

        public FavToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getCatName() {
            return Cat.this.name;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }

    private String name;
    private final Integer birthYear;

    private Cat[] friends;
    private Breed breed;
    private FavToy favToy;

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, Integer age) {
        setName(name);
        if (age >= 0) {
            this.birthYear = LocalDateTime.now().getYear() - age;
        } else {
            this.birthYear = LocalDateTime.now().getYear() - Math.abs(age);
        }
        friends = new Cat[0];
        count++;
    }

    public void meow() {
        System.out.println("Мяу!" + " Меня зовут " + name + ". Мне " + getAge() + " лет");
    }

    public Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }

    public void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(this.friends, getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Кот";
        }
    }

    public Integer getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
        }
    }

    public FavToy getFavToy() {
        return favToy;
    }

    public void setFavToy(FavToy favToy) {
        this.favToy = favToy;
    }
}
