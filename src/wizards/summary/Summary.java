package wizards.summary;

import java.util.HashMap;

public class Summary {

    private HashMap colorCounter;

    public Summary(HashMap colorCounter) {
        this.colorCounter = colorCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Summary summary = (Summary) o;

        return colorCounter != null ? colorCounter.equals(summary.colorCounter) : summary.colorCounter == null;

    }

}
