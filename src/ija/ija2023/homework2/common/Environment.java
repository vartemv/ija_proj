package ija.ija2023.homework2.common;

import ija.ija2023.homework2.tool.common.Position;
import ija.ija2023.homework2.tool.common.ToolEnvironment;

public interface Environment extends ToolEnvironment {
    void addRobot(Robot robot);

    boolean containsPosition(Position pos);

    boolean createObstacleAt(int row, int col);

    boolean obstacleAt(int row, int col);

    boolean obstacleAt(Position p);

    boolean robotAt(Position p);
}