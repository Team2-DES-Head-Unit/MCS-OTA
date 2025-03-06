DESCRIPTION = "RAUC bundle generator with boot update"

inherit bundle

RAUC_BUNDLE_COMPATIBLE = "${MACHINE}"
RAUC_BUNDLE_VERSION = "v20250306"
RAUC_BUNDLE_DESCRIPTION = "RAUC Demo Bundle with Boot Partition Update"

RAUC_BUNDLE_FORMAT = "verity"

RAUC_BUNDLE_SLOTS = "boot rootfs"

RAUC_SLOT_boot = "bootimg"
RAUC_SLOT_boot[fstype] = "vfat"

RAUC_SLOT_rootfs = "minam-image"
RAUC_SLOT_rootfs[fstype] = "ext4"
