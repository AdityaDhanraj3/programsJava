package project1;
/**
 * Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... , determine if a person could attend all meetings.

For example,
Given [ [0, 30], [5, 10], [15, 20] ],
return false.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class MeetingRooms {
	public class Interval{
		int start;
		int end;
		Interval(int start, int end){
			start = 0;
			end = 0;
		}
		
	}
	public static boolean canAttendMeetings(Interval intervals[]) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		for(int i=0;i<intervals.length;i++) {
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		for(int i=0;i<starts.length-1;i++) {
			if(starts[i+1]<ends[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		/*
		 * MeetingRooms mr = new MeetingRooms(); Interval[] intervals = new Interval[3];
		 * intervals[0] = new Interval(0,10); intervals[1] = new Interval(1,3);
		 * intervals[2] = new Interval(2,6); canAttendMeetings(intervals);
		 */
		int starts[] = {0,1,2};
		int ends[] = {10,3,6};
		
	}

}
