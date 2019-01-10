import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;


import java.util.Map;
import java.util.function.Function;

public final class LineTrackerType extends ComplexDataType<LineTracker> {
     /**
   * The name of data of this type as it would appear in a WPILib sendable's {@code .type} entry; a differential drive
   * base a {@code .type} of "DifferentialDrive", a sendable chooser has it set to "String Chooser"; a hypothetical
   * 2D point would have it set to "Point2D".
   */
  private static final String TYPE_NAME = "LineTracker";

  /**
   * The single instance of the point type. By convention, this is a {@code public static final}
   * field and the constructor is private to ensure only a single instance of the data type exists.
   */
  public static final LineTrackerType Instance = new LineTrackerType();

  public LineTrackerType() {
      super(TYPE_NAME, LineTracker.class);
  }

  @Override
  public Function<Map<String, Object>, LineTracker> fromMap() {
    return map -> new LineTracker(
        Maps.getOrDefault(map, "leftLineTracker", false),
        Maps.getOrDefault(map, "centerLineTracker", false),
        Maps.getOrDefault(map, "rightLineTracker", false)
    );
  }

  @Override
  public LineTracker getDefaultValue() {
    return new LineTracker(false, false,false);
  }
}