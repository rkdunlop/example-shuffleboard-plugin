
import edu.wpi.first.shuffleboard.api.data.ComplexData;
import java.util.Map;

public final class LineTracker extends ComplexData<LineTracker> {

    private final boolean leftTracker;
    private final boolean centerTracker;
    private final boolean rightTracker;

    
    public LineTracker(boolean leftTracker, boolean centerTracker, boolean rightTracker) {

        this.leftTracker = leftTracker;
        this.rightTracker = rightTracker;
        this.centerTracker = centerTracker;

    }

    public boolean getLeft() {
        return leftTracker;
    }

    public boolean getCenter() {
        return centerTracker;
    }

    public boolean getRight() {
        return rightTracker;
    }

@Override
public Map<String, Object> asMap() {
    return Map.of("left",leftTracker,"center", centerTracker,"right",rightTracker);
}
}