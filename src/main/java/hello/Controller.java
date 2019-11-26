package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }

  @GetMapping("/process_data")
  public String dbStuff(@RequestParam(name="id", required = false, defaultValue = "id missing") String id,
                        @RequestParam(name="poi", required = false, defaultValue = "poi missing") String poi,
                        @RequestParam(name="when", required = false, defaultValue = "when missing") String when,
                        @RequestParam(name="timeSpecified", required = false, defaultValue = "timeSpecified missing") String timeSpecified,
                        @RequestParam(name="title", required = false, defaultValue = "title missing") String title,
                        @RequestParam(name="shortDesc", required = false, defaultValue = "shortDesc missing") String shortDesc,
                        @RequestParam(name="url", required = false, defaultValue = "url missing")  String url,
                        Model model) {
    model.addAttribute("id", id);
    model.addAttribute("poi", poi);
    model.addAttribute("when", when);
    model.addAttribute("timeSpecified", timeSpecified);
    model.addAttribute("title", title);
    model.addAttribute("shortDesc", shortDesc);
    model.addAttribute("url", url);
    return "asdf";
  }

}