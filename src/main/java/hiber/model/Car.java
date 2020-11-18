package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {

    public Car(){
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setId(long series) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
