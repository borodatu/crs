package com.copyright.rest.controller;

import com.copyright.api.Article;
import com.copyright.api.Folder;
import com.copyright.api.service.LibraryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Rest controller for library service
 * <p/>
 * Date: 1/31/12
 *
 * @author Nikita Levyankov
 */
@Controller
public class LibraryController {

    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/library",
        headers = "Accept=application/json")
    public
    @ResponseBody
    List<Folder> getFolders() {
        return libraryService.getFolders();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/library/{id}",
        headers = "Accept=application/json")
    public
    @ResponseBody
    List<Article> getFolderArticles(@PathVariable Integer id) {
        return libraryService.getFolderArticles(id);
    }


}
