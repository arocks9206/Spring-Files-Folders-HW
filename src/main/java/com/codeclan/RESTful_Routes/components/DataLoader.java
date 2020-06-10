package com.codeclan.RESTful_Routes.components;

import com.codeclan.RESTful_Routes.models.File;
import com.codeclan.RESTful_Routes.models.Folder;
import com.codeclan.RESTful_Routes.models.User;
import com.codeclan.RESTful_Routes.repositories.FileRepository;
import com.codeclan.RESTful_Routes.repositories.FolderRepository;
import com.codeclan.RESTful_Routes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private FolderRepository folderRepository;


    public void run(ApplicationArguments args) {
        User alex = new User("Alex");
        userRepository.save(alex);

        Folder javaProjects = new Folder("Java Projects", alex);
        folderRepository.save(javaProjects);
        File javaIntro = new File("intro", ".java", 23, javaProjects);
        fileRepository.save(javaIntro);
        File javaClass = new File("Class", ".java", 35, javaProjects);
        fileRepository.save(javaClass);
        File javaRelationships = new File("Relationships", ".java", 17, javaProjects);
        fileRepository.save(javaRelationships);
        javaProjects.addFile(javaIntro);
        javaProjects.addFile(javaClass);
        javaProjects.addFile(javaRelationships);
        folderRepository.save(javaProjects);
        alex.addFolder(javaProjects);
        userRepository.save(alex);

        User george = new User("George");
        userRepository.save(george);
        Folder javaScript = new Folder("JavaScript Projects", george);
        folderRepository.save(javaScript);
        File jsIntro = new File("intro", ".js", 29, javaScript);
        fileRepository.save(jsIntro);
        File js = new File("javaScript", ".js", 12, javaScript);
        fileRepository.save(js);
        Folder rubyProject = new Folder("Ruby Projects", george);
        folderRepository.save(rubyProject);
        File rubyIntro = new File("ruby intro", ".ruby", 29, rubyProject);
        fileRepository.save(rubyIntro);
        File ruby = new File("ruby", ".ruby", 12, rubyProject);
        fileRepository.save(ruby);
        javaScript.addFile(jsIntro);
        javaScript.addFile(js);
        rubyProject.addFile(rubyIntro);
        rubyProject.addFile(ruby);
        folderRepository.save(javaScript);
        folderRepository.save(rubyProject);
        george.addFolder(javaScript);
        george.addFolder(rubyProject);
        userRepository.save(george);


        User mike = new User("Mike");
        userRepository.save(mike);
        Folder jsProject = new Folder("jsProjects", george);
        folderRepository.save(jsProject);
        File intro = new File("intro", ".js", 29, jsProject);
        fileRepository.save(intro);
        File vue = new File("vue", ".js", 12, jsProject);
        fileRepository.save(vue);
        Folder folder = new Folder("folder", george);
        folderRepository.save(folder);
        File file1 = new File("ruby intro", ".ruby", 29, folder);
        fileRepository.save(file1);
        File file2 = new File("ruby", ".ruby", 12, folder);
        fileRepository.save(ruby);
        jsProject.addFile(intro);
        jsProject.addFile(vue);
        folder.addFile(file1);
        folder.addFile(file2);
        folderRepository.save(jsProject);
        folderRepository.save(folder);
        mike.addFolder(folder);
        mike.addFolder(jsProject);
        userRepository.save(mike);
    }
}
