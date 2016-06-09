/**
 *    Copyright 2013 Bernardo Luís da Silva Ferreira

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package pt.unlfctdi.cryptosearch.cloud.data.posting;

import java.io.Serializable;

public class Posting implements Cloneable, Serializable, Comparable<Posting>{

	private static final long serialVersionUID = 8880242050287844431L;

	private int docId;
	
	private double score;
	
	public Posting (int docId, double score) {
		this.docId = docId;
		this.score = score;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public int compareTo(Posting o) {
		if (score < o.score)
			return 1;
		if (score > o.score)
			return -1;
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		return docId == ((Posting)o).docId;
	}
	
	@Override
	public Posting clone() {
		return new Posting(docId, score);
	}
}
