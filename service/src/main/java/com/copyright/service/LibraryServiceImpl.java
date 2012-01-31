package com.copyright.service;

import com.copyright.api.Article;
import com.copyright.api.Folder;
import com.copyright.api.service.LibraryService;
import com.copyright.domain.ArticleImpl;
import com.copyright.domain.FolderImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * //TODO class description
 * <p/>
 * Date: 1/10/12
 *
 * @author Nikita Levyankov
 */
@Component
public class LibraryServiceImpl implements LibraryService {

    private static final int FOLDERS_COUNT = 10;
    private static final int ARTICLES_PER_FOLDER_COUNT = 6;

    public List<Folder> getFolders() {
        List<Folder> result = new ArrayList<Folder>();
        for (int i = 1; i < FOLDERS_COUNT; i++) {
            Folder folder = new FolderImpl();
            folder.setId(i);
            folder.setName("Test Folder " + i);
            folder.setArticles(getFolderArticles(folder.getId()));
            result.add(folder);
        }
        return result;
    }

    public List<Article> getFolderArticles(Integer folderId) {
        List<Article> result = new ArrayList<Article>();
        for (int i = 1; i < ARTICLES_PER_FOLDER_COUNT; i++) {
            Article article = new ArticleImpl();
            article.setId(i);
            article.setName("Article " + i + " (Folder " + folderId + ")");
            result.add(article);
        }
        return result;
    }

    public String getFolderDescription(Integer folderId) {
        return "Brief description for Folder with id = " + folderId.toString();
    }

    public String getArticleContent(Integer folderId, Integer articleId) {
        return new StringBuilder("Content of Article  ")
            .append(articleId)
            .append(" (Folder ")
            .append(folderId)
            .append(")").toString();
    }
}
