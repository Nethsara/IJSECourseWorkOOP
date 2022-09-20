package lk.ijse.dep.service;

import lk.ijse.dep.controller.BoardController;

public interface BoardUI {
    void update(int col, boolean isHuman);

    void notifyWinner(Winner winner);
}
