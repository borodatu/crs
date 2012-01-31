package com.copyright.api.service;

import com.copyright.api.Article;
import com.copyright.api.Folder;
import java.util.List;

/**
 * //TODO class description
 * <p/>
 * Date: 1/10/12
 *
 * @author Nikita Levyankov
 */
public interface LibraryService {

    List<Folder> getFolders();

    List<Article> getFolderArticles(Integer folderId);

    String getFolderDescription(Integer folderId);

    String getArticleContent(Integer folderId, Integer articleId);
}
