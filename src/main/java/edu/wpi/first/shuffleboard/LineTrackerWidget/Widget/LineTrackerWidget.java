import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import com.example.simplewidget.data.Point2D;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

@Description(
    name = "Line Tracker",
    dataTypes = LineTracker.class,
    summary = "Displays status of line tracker sensors"
    )

@ParameterizedController(LineTrackerWidget.fxml)
public final class LineTrackerWidget extends SimpleAnnotatedWidget<LineTracker> {
    
}