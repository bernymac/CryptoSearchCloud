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

public class TermIdDocId implements Comparable<TermIdDocId>{

	private int termId;
	
	private int docId;

	public TermIdDocId (int termId, int docId) {
		this.termId = termId;
		this.docId = docId;
	}
	
	public int getTermId() {
		return termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	@Override
	public int compareTo(TermIdDocId o) {
		if (termId < o.termId)
			return -1;
		if (termId > o.termId)
			return 1;
		// (termId == o.termId)
		if (docId < o.docId)
			return -1;
		if (docId > o.docId)
			return 1;
		// (termId == o.termId) && (docId == o.docId)
		return 0;
	}
		
	
}
