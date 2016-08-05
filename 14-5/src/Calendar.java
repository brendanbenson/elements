import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.sort;

public class Calendar {
    public int maxOverlaps(List<Event> events) {
        sort(events);

        int maxOverlappingEvents = 0;

        List<Event> runningEvents = new ArrayList<>();

        for (Event e : events) {
            int start = e.getStart();

            Iterator<Event> it = runningEvents.iterator();
            while (it.hasNext()) {
                Event re = it.next();
                if (re.getFinish() > start) {
                    it.remove();
                }
            }

            runningEvents.add(e);

            if (runningEvents.size() > maxOverlappingEvents) {
                maxOverlappingEvents = runningEvents.size();
            }
        }

        return maxOverlappingEvents;
    }

    public static class Event implements Comparable {
        private int start, finish;

        public Event(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        public int getStart() {
            return start;
        }

        public int getFinish() {
            return finish;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Event event = (Event) o;

            if (start != event.start) return false;
            return finish == event.finish;

        }

        @Override
        public int hashCode() {
            int result = start;
            result = 31 * result + finish;
            return result;
        }

        @Override
        public int compareTo(Object o) {
            return this.start - ((Event) o).getStart();
        }

        @Override
        public String toString() {
            return "Event{" +
                    "start=" + start +
                    ", finish=" + finish +
                    '}';
        }
    }
}
