package guru.springframework.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import guru.springframework.services.RecipeService;

@RestController
public class IndexController {
    private final RecipeService recipeService;  

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public ModelAndView getIndexPage(){
        return new ModelAndView("index");
    }

    @RequestMapping({"recipes", "/recipes"})
    public ModelAndView getRecipesListPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return new ModelAndView("recipes", "", model);
    }
}
