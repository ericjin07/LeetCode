package com.eric.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode {

    private List<FileSystemNode> subNode;

    public Directory(String path) {
        super(path);
        subNode = new ArrayList<>();
    }

    @Override
    public int countNumOfFiles() {
        int numOfFile = 0;
        for (FileSystemNode node : subNode) {
            numOfFile += node.countNumOfFiles();
        }
        return numOfFile;
    }

    @Override
    public long countSizeOfFile() {
        int sizeOfFile = 0;
        for (FileSystemNode node : subNode) {
            sizeOfFile += node.countSizeOfFile();
        }
        return sizeOfFile;
    }

    public void addSubNode(FileSystemNode node) {
        subNode.add(node);
    }

    public void removeSubNode(FileSystemNode node) {
        subNode.removeIf(next -> next.getPath().equalsIgnoreCase(node.getPath()));
    }
}
