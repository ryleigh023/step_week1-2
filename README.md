# RA2411026010734 - Java Problem Solutions

This repository contains Java implementations for **10 different problems**, covering real-world scenarios like social media systems, e-commerce, caching, analytics, and more. Each problem is implemented in a separate Java file under `App/src/`.

---

## Folder Structure


RA2411026010734/
│
├── README.md
└── App/
└── src/
├── Problem1.java
├── Problem2.java
├── Problem3.java
├── Problem4.java
├── Problem5.java
├── Problem6.java
├── Problem7.java
├── Problem8.java
├── Problem9.java
└── Problem10.java


---

## Problem List

### **Problem 1: Social Media Username Availability Checker**
- **Scenario:** Check if usernames are available in real-time for 10M users.
- **Concepts:** Hash tables, O(1) lookup, frequency counting, suggestions.
- **Use Cases:** Twitter/Instagram registration, gaming platforms.
- **File:** `Problem1.java`

---

### **Problem 2: E-commerce Flash Sale Inventory Manager**
- **Scenario:** Handle 50,000 concurrent purchase requests for limited stock.
- **Concepts:** HashMap for stock, synchronized updates, FIFO waiting list.
- **Use Cases:** Amazon Prime Day deals, ticket booking.
- **File:** `Problem2.java`

---

### **Problem 3: DNS Cache with TTL**
- **Scenario:** Reduce DNS lookup from 100ms → <1ms with caching.
- **Concepts:** HashMap with TTL, expiration, LRU eviction, cache hits/misses.
- **Use Cases:** Browser DNS cache, CDN edge servers.
- **File:** `Problem3.java`

---

### **Problem 4: Plagiarism Detection System**
- **Scenario:** Detect plagiarism across 100,000 essays efficiently.
- **Concepts:** N-grams, hash maps, similarity calculation.
- **Use Cases:** Academic plagiarism detection (Turnitin), code similarity.
- **File:** `Problem4.java`

---

### **Problem 5: Real-Time Analytics Dashboard**
- **Scenario:** Track website traffic with 1M page views/hour.
- **Concepts:** HashMaps for page views, unique visitors, traffic sources.
- **Use Cases:** Google Analytics, trending topics, e-commerce tracking.
- **File:** `Problem5.java`

---

### **Problem 6: Distributed Rate Limiter**
- **Scenario:** Limit API requests for 100,000 clients efficiently.
- **Concepts:** Token bucket, hash tables, time-based counters.
- **Use Cases:** API gateways, GitHub API rate limits, payment APIs.
- **File:** `Problem6.java`

---

### **Problem 7: Autocomplete System**
- **Scenario:** Suggest search queries in real-time from 10M previous queries.
- **Concepts:** Trie + HashMap, frequency counting, typo correction.
- **Use Cases:** Search engines, Amazon suggestions, IDE code completion.
- **File:** `Problem7.java`

---

### **Problem 8: Parking Lot Management**
- **Scenario:** Track 500 parking spots, optimize allocation.
- **Concepts:** Open addressing, linear probing, hash functions, statistics.
- **Use Cases:** Airport/mall parking systems, smart parking apps.
- **File:** `Problem8.java`

---

### **Problem 9: Two-Sum Problem Variants**
- **Scenario:** Detect fraudulent transactions, duplicates, and K-sum patterns.
- **Concepts:** Hash maps, complement lookup, time-window filtering.
- **Use Cases:** Fraud detection, financial transaction analysis.
- **File:** `Problem9.java`

---

### **Problem 10: Multi-Level Cache System**
- **Scenario:** Optimize caching for 10M concurrent users (memory → SSD → DB).
- **Concepts:** Hash maps, LRU eviction, cache promotion, performance tracking.
- **Use Cases:** Netflix video streaming, CDN caching, DB query optimization.
- **File:** `Problem10.java`

---

##  How to Run

1. Open the project in **IntelliJ IDEA**.
2. Navigate to `App/src/`.
3. Open the Java file you want to run (e.g., `Problem1.java`).
4. Run the `main` method in the file.
5. Repeat for other problems as needed.

---

##  Notes

- Each problem is **self-contained** in a single Java file.
- Some problems use **HashMaps**, **queues**, **sets**, or **priority queues**.
- Designed for **learning hash table applications, concurrency, and real-time system design** in Java.

---

##  Author

RA2411026010734 - Java Problem Solutions Repository
