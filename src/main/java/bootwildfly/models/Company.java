package bootwildfly.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="companies")
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @NotNull
  @Size(min = 3, max = 80)
  private String name;
  
  @NotNull
  @Size(min = 2, max = 80)
  private String city;

  private int tin;

  public Company() { }

  public Company(int id) { 
    this.id = id;
  }

  public Company(String name, String city) {
    this.city = city;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int value) {
    this.id = value;
  }

  public String getCity() {
    return city;
  }
  
  public void setCity(String value) {
    this.city = value;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }
  
  public int getTin() {
    return tin;
  }

  public void setTin(int value) {
    this.id = tin;
  }
  
}
