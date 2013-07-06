(ns hiphip.double
  "Utilities for double arrays"
  (:refer-clojure :exclude [amap areduce alength aget aset aclone])
  (:import hiphip.double_.JavaBaseline))

(def type-info
  {:etype `double
   :atype "[D"
   :constructor `double-array
   :min-value `Double/MIN_VALUE
   :max-value `Double/MAX_VALUE})

(load "type_impl")