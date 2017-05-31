public class SubApatosaurus extends Apatosaurus {

  String has_striped_tail;

  SubApatosaurus() {
    super();
    has_striped_tail = "Yes it does have a striped tail!";
  }
  SubApatosaurus(String sn, int h, int w, int ms, String d, String g, String hst) {
    super(sn, h, w, ms, d, g);
    has_striped_tail = "Yes it does have a striped tail!";
  }
  public String getStripedTail() {
    return has_striped_tail;
  }
  public void setStripedTail(String strip) {
    has_striped_tail = strip;
  }
  }
