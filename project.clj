;; Copyright (c) Tomek Lipski. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file LICENSE.txt at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(defproject ganelon-util "0.8-SNAPSHOT"
  :description "Utility functions used by Ganelon - but independent from compojure/noir"
  :url "http://ganelon.tomeklipski.com/util-doc/index.html"
  :dependencies [[org.clojure/clojure "1.4.0" ]
                 [org.clojure/core.memoize "0.5.2" :exclusions [org.clojure/clojure]]
                 [org.clojure/tools.logging "0.2.3" :exclusions [org.clojure/clojure]]]
  :plugins [[codox "0.6.4"]]
  :codox {:src-dir-uri "http://github.com/tlipski/ganelon-util/blob/master"
          :output-dir "doc"
          :src-linenum-anchor-prefix "L"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  )